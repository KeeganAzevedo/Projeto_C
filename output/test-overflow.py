# Generated Python code from SafeLang

def Int8(value):
    value = int(value)
    if value < -128 or value > 127:
        raise OverflowError("Int8 overflow")
    return value
def Int32(value):
    value = int(value)
    if value < -2147483648 or value > 2147483647:
        raise OverflowError("Int32 overflow")
    return value
i1 = Int8(10)
i2 = Int32(999)
while True:
    try:
        i1 = Int8(i2)
        break
    except Exception:
        print(("ERROR: overflow!"), sep="")
        break
print(str(i1), sep="")
