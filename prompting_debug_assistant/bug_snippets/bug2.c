#include <string.h>
#include <stdio.h>
#include <stdlib.h>

void process_input(char *user_input) {
    char buffer[10];
    
    printf("Processing input of length: %lu\n", strlen(user_input));

    strcpy(buffer, user_input); 
    
    printf("Received command: %s\n", buffer);
    printf("Command processed successfully.\n");
}

int main(int argc, char *argv[]) {
    printf("--- System Command Processor ---\n");

    if (argc > 1) {
        process_input(argv[1]);
    } else {
        printf("Test 1 (Safe):\n");
        process_input("Help");
    }

    return 0;
}


