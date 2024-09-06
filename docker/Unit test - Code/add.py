def find_sign(a: int, b: int) -> str:
    summation = a + b
    if summation > 0:
        ans = "positive"
    else:
        ans = "negative"
    return ans