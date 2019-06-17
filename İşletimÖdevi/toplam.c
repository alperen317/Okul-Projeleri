#include <stdio.h>
#include <string.h>
 
int main(int argc,char* argv[],char** envp)
{
   int a=atoi(argv[0]);
   int b=atoi(argv[1]);
   int toplam=0;
   for(a=0; a<=b; a++){
   	 toplam += a;	
   }
   
   printf("Toplam = %d \n",toplam);
   
   
   return 0;
}
