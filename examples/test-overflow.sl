type Int8: integer[8];
type Int32: integer[32];

i1 := 10: Int8;
i2 := 999: Int32;

try
   i1 := i2;
rescue
   writeln("ERROR: overflow!");
end;

writeln string(i1);