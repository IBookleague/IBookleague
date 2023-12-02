from bs4 import BeautifulSoup
import requests
import pandas as pd

url = "https://ridibooks.com/category/bestsellers/101?page=1&period=steady"
r = requests.get(url)
soup = BeautifulSoup(r.text, 'html.parser')

name_list = []
author_list = []

for i in range(1,5):

    r = requests.get(f"https://ridibooks.com/category/bestsellers/101?page={i}&period=steady")
    soup = BeautifulSoup(r.text, 'html.parser')
    for j in range(1, 12):
        name = soup.select_one(f"#__next > main > div > section > ul.fig-1rl9mz1 > li:nth-child({j}) > div > div.fig-1s05j40 > div > div:nth-child(1) > a").text
        author = soup.select_one(f"#__next > main > div > section > ul.fig-1rl9mz1 > li:nth-child({j}) > div > div.fig-1s05j40 > div > div.fig-18cjgl > div > p.fig-b6nxu7 > a").text
        name_list.append(name)
        author_list.append(author)

raw_data = {'book_name' : name_list, 'author' : author_list}
raw_data = pd.DataFrame(raw_data)
raw_data.to_excel(excel_writer='korean_literary.xlsx')







