javac -d classes/ ../src/ru/ifmo/se/lab4/enums/*
javac -d classes/ ../src/ru/ifmo/se/lab4/exceptions/*
javac -cp ".:../src" -d classes/ ../src/ru/ifmo/se/lab4/characters/*
javac -cp ".:../src" -d classes/ ../src/ru/ifmo/se/lab4/support/*
javac -cp ".:../src" -d classes/ ../src/ru/ifmo/se/lab4/objects/*.java
javac -cp ".:../src" -d classes/ ../src/ru/ifmo/se/lab4/objects/nature/*
javac -cp ".:../src" -d classes/ ../src/ru/ifmo/se/lab4/*.java


jar cvmf MANIFEST.MF lab3.jar -C classes/ .

java -jar lab4.jar
