import time

from bs4 import BeautifulSoup
import requests
import time
def find_jobs():
    print("Put some skill that you nnot familiar with")
    unfamiliar_skill = input('> ')
    print(f"Filtring out {unfamiliar_skill}")
    html_text = requests.get('https://www.timesjobs.com/candidate/job-search.html?searchType=personalizedSearch&from=submit&txtKeywords=python&txtLocation=').text
    soup = BeautifulSoup(html_text, 'lxml')
    jobs = soup.find_all('li', class_='clearfix job-bx wht-shd-bx')
    for index, job in enumerate(jobs):
        published_date = job.find('span', 'sim-posted').span.text
        if 'few' in published_date:
            company_name = job.find('h3', class_='joblist-comp-name').text.replace(' ','')
            skill = job.find('span', 'srp-skills').text.replace(' ', '')
            more_info = job.header.h2.a['href']

            if unfamiliar_skill not in skill:
                with open(f"/home/od/Code/Nur_Islom/python/web_scraping/real/posts/{index}.txt", 'w') as f:

                    f.write(f"Company Name: {company_name.strip()}\n")
                    f.write(f"Requred Skills: {skill.strip()}\n")
                    f.write(f"More Info: {more_info}")
                print(f"File saved: {index}")

if __name__ == '__main__':
    while True:
        find_jobs()
        time_wait = 10
        print(f"Waiting {time_wait} minuts...")
        time.sleep(60*time_wait)