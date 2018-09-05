''' Date 5-9-2018 '''


def check_valid(email):
    try:
        username, url = email.split("@")
        website, extension = url.split(".")
    except ValueError:
        return False

    if not username.replace("-", "").replace("_", "").isalnum():
        return False
    if not website.isalnum():
        return False
    if len(extension) > 3:
        return False
    return True

if __name__ == "__main__":
    n = int(raw_input())
    emails = [raw_input() for email in range(n)]

    valid = list(filter(check_valid, emails))
    print(sorted(valid))