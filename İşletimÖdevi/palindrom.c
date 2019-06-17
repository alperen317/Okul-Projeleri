#include <stdio.h>
#include <string.h>


char* strcpy(char * dest_ptr, const char * src_ptr)
 {
  	   char* strresult = dest_ptr;
  	   if((NULL != dest_ptr) && (NULL != src_ptr))
  	   {
  	     /* Start copy src to dest */
  	     while (NULL != *src_ptr)
  	     {
  	       *dest_ptr++ = *src_ptr++;
  	     }
  	     /* put NULL termination */
  	     *dest_ptr = NULL;
  	   }
  	   return strresult;
  	 
 	 }

char *strrev(char *str)
{
      char *p1, *p2;

      if (! str || ! *str)
            return str;
      for (p1 = str, p2 = str + strlen(str) - 1; p2 > p1; ++p1, --p2)
      {
            *p1 ^= *p2;
            *p2 ^= *p1;
            *p1 ^= *p2;
      }
      return str;
}


int main(int argc,char* argv[])
{ 
  char *a=argv[1];
  char b[50];
  
  strcpy(b,a);


  strrev(b);
   
   if (strcmp(a,b) == 0)
      printf("Palindromik \n");
   else
      printf("Palindiromik değil \n");
    
   return 0;
}

