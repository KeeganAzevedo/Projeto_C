# Generated Python code from SafeLang

i = int(input("Integer: "))
print("Integers: ", str(i), sep="", end="")
print(" ; ", str((i // 2)), " ; ", str((i % 2)), sep="", end="")
print(" ; ", str((i / 2)), sep="", end="")
print(" ; ", str((i * (((2 + i) - 5)))), sep="", end="")
print()
r = None
r = i
print("Reals: ", str(r), " ; ", str((r * i)), " ; ", str(((r * 2) + (((i * r) / 2)))), sep="")
r = (2 / 3)
print(str(r), sep="")
r = 1.333
print(str(r), sep="")
r = 0.3e10
print(str(r), sep="")
