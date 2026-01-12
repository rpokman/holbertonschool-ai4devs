#include <string.h>
#include <stdio.h>

void process_input(char *user_input) {
    char buffer[10];
    strcpy(buffer, user_input); 
    printf("Reçu : %s\n", buffer);
}
