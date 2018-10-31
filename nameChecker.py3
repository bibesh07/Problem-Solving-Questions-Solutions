#Question:

# find common names in a zip file which contains unknown number of txt files with names 
# NAMES CANNOT BE REPEATED IN A FILE

#Example: python3 nameChecker.py3 namelist.zip

#Solution:

import zipfile, collections, sys
list = [];
zip = zipfile.ZipFile(sys.argv[1], 'r');
outputFile = open("ans.txt", "w");
for name in zip.namelist():
	for line in zip.read(name).splitlines():
		list.append(line.decode("utf-8"));
printStuff = '\n'.join([i for i in collections.Counter(list) if collections.Counter(list)[i]==len(zip.namelist())])
print (printStuff);
outputFile.write(printStuff);
outputFile.close();
