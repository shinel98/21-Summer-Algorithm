#include <stdio.h>

int main3_4(){
    int door;
    int first;

    scanf("%d", &door);
    scanf("%d", &first);

    
    if(door<=5){
        for(int i=0; i<door-1; i++){
            first = !first;
            printf("%d\n", first);
        }
    }
    else 
        printf("Love is open door\n");
    return 0;
}