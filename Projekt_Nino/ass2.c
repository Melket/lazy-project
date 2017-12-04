//
// Created by Bendza on 02.12.2017.
//

#include<stdio.h>

int main(int argc, char* argv[])
{
    if(argc <= 1)
    {
        printf("You haven't entered a Filename.");
        return 1;
    }
    else
    {
        printf("argv[%d]: %s\n", argc, argv[1]);
    }

    return 0;
}
