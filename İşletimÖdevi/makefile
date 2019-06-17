CC=gcc
CFLAGS=-c -Wall

all: myshell palindrom toplam asalmı

myshell: myshell.o
	$(CC) myshell.o -o myshell
myshell.o:
	$(CC) $(CFLAGS) myshell.c

palindrom: palindrom.o
		$(CC) palindrom.o -o palindrom
palindrom.o:
	$(CC) $(CFLAGS) palindrom.c

toplam: toplam.o
		$(CC) toplam.o -o toplam
toplam.o:
	$(CC) $(CFLAGS) toplam.c

asalmı: asalmı.o
		$(CC) asalmı.o -o asalmı
asalmı.o:
	$(CC) $(CFLAGS) asalmı.c

clean:
	rm -rf *o myshell
