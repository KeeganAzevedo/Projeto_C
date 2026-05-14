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
i0 = None
i0 = int(3)
r0 = None
r0 = float((2 / 3))
r0 = float(1.333)
i1 = Int8(10)
i2 = Int32(i1)
while True:
    try:
        i1 = Int8(i2)
        break
    except Exception:
        break
while True:
    try:
        i1 = Int8(i2)
        break
    except Exception:
        print(("ERROR: overflow!"), sep="")
        break
while True:
    try:
        i1 = Int8(i2)
        break
    except Exception:
        i2 = Int32(Int8(i2))
        continue
        break
n = None
while True:
    try:
        n = int(int(input("Number: ")))
        break
    except Exception:
        print(("ERROR: invalid integer number!"), sep="")
        continue
        break
print(str(n), sep="")
def Real64(value):
    return float(value)
r = None
r = float(12.5)
r2 = None
r2 = Real64(1.4e10)
r2 = Real64(1.4e-10)
print(str(r2), sep="")
