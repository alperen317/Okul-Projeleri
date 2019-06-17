#include <stdio.h>
#include <string.h>
#include <stdlib.h>
void main(int argc,char* argv[],char** envp){
    char* command=NULL;
    while(0==0){ //Programın sürekli çalışması için
        printf("myshell>>");
        gets(&command);//klavyeden veri okumak için scanf fonksiyonu kelime kelime işlem yapıyordu. Bütün cümleyi okumak için gets fonksiyonu kullandım.
	int len=strlen(&command);//daha sonra oluşturacağım char* lara yer ayırmak için boyut
	int count=0;
	char* andcom1=calloc(len + 1, 1);
	char* andcom2=calloc(len + 1, 1);
	strcpy(andcom1,&command);
	strcpy(andcom2,&command);
	char* andtoken;
	andtoken=strtok(andcom1,"&");//'&' a göre split
	while(andtoken!=NULL){
		count++;//dizi boyutu için
		andtoken=strtok(NULL,"&");
	}
	char* andarr[count];
	int arrcount=count;//countu başka yerlerde kullandığım için for ile dizi boyutu kadar yanı bir satırdaki komut sayısı kadar dönmesi için boyutu farklı bir değişkene attım.
	andtoken=strtok(andcom2,"&");
	count=0;
	while(andtoken!=NULL){
		andarr[count]=andtoken;
		andtoken=strtok(NULL,"&");
		count++;
	}
	count=0;
	int i;
	int sttn=0;//fordan çıkmasının nedeni exit komutu ise programı bitirmesi için değilse progra çalışmaya devam edecek ve yeni komut isteyecek
	for(i=0;i<arrcount;i++){
		count=0;
		len=strlen(andarr[i]);
		char * com1 = calloc (len + 1, 1);
		char * com2 = calloc (len + 1, 1);
		char * com3 = calloc (len + 1, 1);
		strcpy(com1,andarr[i]);
		strcpy(com2,andarr[i]);
		strcpy(com3,andarr[i]);
		
		char* token;
		
		char *t;
		t=strtok(com1," ");//' '(boşluk) karakterine göre split
		while(t!=NULL){
			t=strtok(NULL," ");
			count++;//dizi boyutu için
		}
		char* cmd[count];
		token=strtok(com2," ");
		int j=0;
		while(token!=NULL){
		    cmd[j]=token;//diziye verilerin atılması
		    token=strtok(NULL," ");
		    j++;
		}
		
		if(strcmp(cmd[0],"exit")==0){
		    i=arrcount;//for koşulun dışına çıkıp fordan çıkacak
		    sttn=1;
		}else if(strcmp(cmd[0],"clear")==0){//ekranı temizleyecek
		    system("clear");
		}else if(strcmp(cmd[0],"cat")==0){//girilen yazıyı yazdıracak
		    printf("cat:");
		    token=strtok(com3," ");
		    token=strtok(NULL," ");
		    while(token!=NULL){
		    	printf("%s",token);
		    	token=strtok(NULL," ");
			if(token!=NULL){
				printf(" ");
			}
		    }
		    printf("\n");
		}else if(strcmp(cmd[0],"asalmı")==0){
			int lenght=sizeof(cmd)/sizeof(cmd[0]);//dizinin boyutu
			if(lenght==2){//girilen parametrelerin sayısı kontrolü
				int f=fork();//dallanma
				int k=0;
				if(f==0){
					char* argv[2];//parametreler 
					argv[0]=cmd[1];
					argv[1]=NULL;
					k=execve("asalmı",argv,envp);
					perror("execve failed");
				}else{
					wait(&k);//alt programın bitmesini bekler
				}
			}else{
				printf("Hata Tekrar deneyiniz.\n");
			}
			
		}else if(strcmp(cmd[0],"toplam")==0){
			int lenght=sizeof(cmd)/sizeof(cmd[0]);//dizinin boyutu
			if(lenght==3){//girilen parametrelerin sayısı kontrolü
				int f=fork();//dallanma
				int k=0;
				if(f==0){
					char* argv[3];//parametreler 
					argv[0]=cmd[1];
					argv[1]=cmd[2];
					argv[2]=NULL;
					k=execve("toplam",argv,envp);
					perror("execve failed");
				}else{
					wait(&k);//alt programın bitmesini bekler
				}
			}else{
				printf("Hata Tekrar deneyiniz.\n");
			}
			
		}else if(strcmp(cmd[0],"palindrom")==0){
			int lenght=sizeof(cmd)/sizeof(cmd[0]);
			if(lenght==2){
				int f=fork();
				int k=0;
				if(f==0){
					char* argv[3];
					argv[0]=cmd[0];
					argv[1]=cmd[1];
					argv[2]=NULL;
					if ( execve(argv[0],argv,NULL) == -1){
						perror("execve failed \n");
					}
				}
			}else{
				printf("Hata Tekrar deneyiniz.\n");
			}		
		}else{
		    printf("Hata Tekrar deneyiniz.\n");
		}
	}
	if(sttn==1){
		break;//sonsuz döngü sonlanır.
	}
    }
}
