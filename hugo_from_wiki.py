import requests
from bs4 import BeautifulSoup

r = requests.get("https://namu.wiki/w/%ED%9C%B4%EA%B3%A0%EC%83%81")
soup = BeautifulSoup(r.text, 'html.parser')

work = soup.select("#xeZKSV0Ou")
print(work)