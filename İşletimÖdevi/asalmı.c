#include <stdio.h>
#include <string.h>
 
int main(int argc,char* argv[],char** envp)
{
	int sayi = atoi(argv[0]);
	int index = 2;
	
	if (sayi<0)
	{
		printf("pozitif bir sayi girmelisiniz! \n");
		return 0;
	}
	
	while (index < sayi /2)
	{
		if (sayi % index == 0)  
		{
			printf("%d, %d sayisina bolunebildigi icin asal sayi degildir! \n", sayi, index);
			return 0;
		}
		index++;
	}

	printf("%d bir asal sayidir! \n", sayi);
	return 0;
}
