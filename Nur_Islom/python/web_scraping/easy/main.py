from bs4 import BeautifulSoup

with open('/home/od/Code/Nur_Islom/python/web_scraping/easy/home.html', 'r') as html_file:
    content = html_file.read()
    # print(content)

soup = BeautifulSoup(content, 'lxml')
# print(soup.prettify())
# tag = soup.find('h5') # this will find first occurance
# course_html_tags = soup.find_all('h5')
# for course in course_html_tags:
#     print(course.text)

course_cards = soup.find_all('div', class_ = 'card')
for course in course_cards:
    course_name = course.h5.text
    course_price = course.a.text.split()[-1]

    print(f'{course_name} costs {course_price}')