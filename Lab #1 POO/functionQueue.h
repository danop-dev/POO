//FISIERUL functionQueue.h
//cozi

struct stat
{
    char denumirea[100];
    char capitala[100];
    int populatia;
    int id;
    struct stat *next;

} * head, *before, *after;

int length_queue()
{
    if (head == NULL)
    {
        printf("Queue nu are nici un element.\n");
        exit(0);
    }
    after = before = head->next;
    int count = 0;
    do
    {
        count++;
        before = before->next;
    } while (before != after);

    return count;
}

void enqueue(char *denumirea, char *capitala, int populatia, int id)
{
    struct stat *queue = (struct stat *)malloc(sizeof(struct stat));

    strcpy(queue->denumirea, denumirea);
    strcpy(queue->capitala, capitala);
    queue->populatia = populatia;
    queue->id = id;

    if (head == NULL)
        queue->next = queue;
    else
    {
        queue->next = head->next;
        head->next = queue;
    }
    head = queue;
}

void enqueue__position(int pos)
{
    struct stat *queue = head;
    int i = 0;
    bool find = false;
    if (head == NULL)
    {
        printf("Queue nu are nici un element.\n");
        exit(0);
    }
    else if (pos > length_queue())
    {
        printf("Queue este mai mica ca : %d \n", pos);
    }
    else
    {

        while (queue != NULL)
        {
            if (pos == i)
            {
                printf(" Denumirea Statul : \n");
                fflush(stdin);
                scanf("%s", queue->denumirea);

                printf(" Capitala : \n");
                scanf("%s", queue->capitala);

                printf(" Populatia : \n");
                scanf("%d", &queue->capitala);

                printf(" ID : \n");
                scanf("%d", &queue->id);
                find = true;
                break;
            }
            i++;
            queue = queue->next;
        }
    }
}

char dequeue(char *remove)
{
    if (head == NULL)
    {
        printf("Queue nu are nici un element.\n");
        exit(0);
    }
    before = head->next;
    remove = before->denumirea;

    if (before == head)
        head = NULL;
    else
        head->next = before->next;
    free(before);
    return *remove;
}

char dequeue_pos(char *remove, int pos_delete)
{
    struct stat *queue = head;
    int i = 0;
    if (head == NULL)
    {
        printf("Queue nu are nici un element.\n");
        exit(0);
    }

    while (queue != NULL)
    {
        if (pos_delete == i)
        {
            before = queue->next;
            remove = before->denumirea;

            if (before == queue)
                queue = NULL;
            else
                queue->next = before->next;
            free(before);
            return *remove;
        }
        i++;
        queue = queue->next;
    }
}

void swapping(struct stat *x, struct stat *y)
{
    struct stat *temp = x->next;
    x->next = y->next;
    y->next = temp;
}

void swap(int *first, int *second)
{
    if (head == NULL)
    {
        printf("Queue nu are nici un element.\n");
        exit(0);
    }
    struct stat *i = before = after = head->next, *i_pr = NULL,
                *j = before = after = head->next, *j_pr = NULL;
    for (i = head; i != NULL && i->id != *first; i = i->next)
        i_pr = i;
    for (j = head; j != NULL && j->id != *second; j = j->next)
        j_pr = j;
    if (i_pr != NULL)
        i_pr->next = j;
    else
        head = j;
    if (j_pr != NULL)
        j_pr->next = i;
    else
        head = i;

    swapping(i, j);
}

void display_queue()
{
    if (head == NULL)
    {
        printf("Queue nu are nici un element.\n");
        exit(0);
    }
    printf(" ------- Queue : ------- \n");

    after = before = head->next;

    int count = 0;
    do
    {
        count++;
        printf(" \n ------- Statul %d ------- \n", count);
        printf(" Denumirea  :  %s \n", before->denumirea);
        printf(" Capitala   :  %s \n", before->capitala);
        printf(" Populatia  :  %d \n", before->populatia);
        printf(" Populatia  :  %d \n", before->id);
        printf(" \n ------------------------ \n");
        before = before->next;
    } while (before != after);
    printf("\n");
}