#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>
#include <semaphore.h>

sem_t lockCustomerMarker;
sem_t lockbarberShop;
int counter = 0;

struct Koltuk
{

int thread_no;
int dolumu;


}k0, k1, k2, k3;

//Global koltuk dizisi
struct Koltuk Koltuklar[4];

void *barberShop(int i){

	pthread_t ptid = pthread_self();
    printf("Thread No : %d \n", (int)ptid);

}

void *customerMaker(){

	int i=0;
	printf("Customer Maker Created \n\n");
	fflush(stdout);
	pthread_t customer[10];
	
	while(i<10)
	 {	
	 	
		pthread_create(&customer[i],NULL,barberShop,NULL);
		i++;
	
	}
	pthread_exit(0);
}


int main(int argc, char *argv[]){
	//Koltuklarý diziye aktardým.
	Koltuklar[0]=k0;
    Koltuklar[1]=k1;
    Koltuklar[2]=k2;
    Koltuklar[3]=k3;
    

  
	
	
	pthread_t customerM, barber;
	
	pthread_create(&customerM, NULL,customerMaker,NULL);
	
	
		pthread_join(customerM,NULL);
	


	
	return 0;
}

