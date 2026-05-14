# Generated Python code from SafeLang

meter = 1.0
m = meter
second = 1.0
s = second
inch = (0.0254 * meter)
in_ = inch
# type Velocity
# type Acceleration
# type Area

# Generated Python code from SafeLang

# use "physics.sl"
l = None
t = None
v = None
l = (10 * meter)
t = (2 * second)
v = (l / t)
print("Velocity: ", str(v), sep="")
l = (float(input("Distance: ")) * meter)
t = (float(input("Time: ")) * second)
v = (l / t)
print("Velocity: ", str(v), sep="")
