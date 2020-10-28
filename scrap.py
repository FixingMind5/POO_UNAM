import mechanize
import lxml.html as html

CLASSMATES_NAMES_XPATH = "//tbody/tr/td/a/text()"

browser = mechanize.Browser()

browser.set_handle_equiv(True)
browser.set_handle_gzip(True)
browser.set_handle_redirect(True)
browser.set_handle_referer(True)
browser.set_handle_robots(False)
browser.set_handle_refresh(mechanize._http.HTTPRefreshProcessor(), max_time=1)

browser.addheaders = [('User-agent', 'Chrome')]

browser.open("https://sea.acatlan.unam.mx/login/index.php")

for form in browser.forms():
    print(form)

browser.select_form(nr=0)
browser.form["username"] = "316041931"
browser.form["password"] = "20001214"

browser.submit()

required_page = browser.open(
    "https://sea.acatlan.unam.mx/user/index.php?contextid=190699&id=2100&perpage=5000").read()
parsed = html.fromstring(required_page)
classmates_names = parsed.xpath(CLASSMATES_NAMES_XPATH)
cleaned_names = [" ".join(name.split(" ")[1:]) for name in classmates_names]

with open("names2.txt", "w", encoding="utf-8") as file:
    for name in cleaned_names:
        file.write(f"{name}\n")

print("Ready :)")
