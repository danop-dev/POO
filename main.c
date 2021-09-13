//Queue - Cozi
//FISIERUL main.c

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>
#include "functionQueue.h"

int main()
{
    int nr_list = 0;
    int aleg = 0;
    bool completat = false;
    int pos, pos_delete;

    char denumirea[50], capitala[50];
    int populatia, id;
    char remove[0];
    int first, second;
    system("cls");
    do
    {
        printf(" \n _______________________  Meniu  ____________________ \n");
        printf(" \n |1. Introducerea unui element.                        |");
        printf(" \n |2. Adaugarea unui element la o pozitie n.            |");
        printf(" \n |3. Stergerea primului element.                       |");
        printf(" \n |4. Stergerea a n element.                            |");
        printf(" \n |5. Schimbul a 2 elemente din lista.                  |");
        printf(" \n |7. Afisarea informatiei.                             |");
        printf(" \n |0. Iesire din program.                               |");
        printf(" \n _____________________________________________________ \n");

        printf(" \n\n\nAlgeti optiunea: ");
        scanf("%d", &aleg);

        switch (aleg)
        {
        case 1:

            printf(" Denumirea Statul : \n");
            fflush(stdin);
            scanf("%s", denumirea);

            printf(" Capitala : \n");
            scanf("%s", capitala);

            printf(" Populatia : \n");
            scanf("%d", &populatia);

            printf(" ID : \n");
            scanf("%d", &id);

            enqueue(denumirea, capitala, populatia, id);
            nr_list++;
            completat = true;
            break;

        case 2:
            printf("Adaugarea unui element pe pozitia : ");
            scanf("%d", &pos);
            enqueue__position(pos);
            break;

        case 3:
            dequeue(remove);
            printf("Elementu de la inceputul cozii a fost sters cu succes.\n");
            break;

        case 4:
            printf("Introdu pozitia care se va sterge: ");
            scanf("%d", &pos_delete);
            dequeue_pos(remove, pos_delete);
            break;
        case 5:
            printf("Introdu pozitia 1: ");
            scanf("%d", &first);
            printf("Introdu pozitia 2: ");
            scanf("%d", &second);
            swap(&first, &second);

        case 7:
            system("cls");
            if (completat)
            {
                display_queue();
            }
            else
            {
                printf("Error: Introdu datele inca o data.\n");
                printf("Alege 1 sau 2. \n");
            }
            break;

        case 0:
            printf(" \n Programul a fost oprit. ");
            break;

        default:
            system("cls");
            printf(" \n\nError Nu avem asa optiune in meniu\n\n ");
            printf(" -------------------------- \n");
        }
    } while (aleg != 0);
}