#include <stdio.h>
#include <stdbool.h>
#include <string.h>

int main()
{
    char palavra[1000];
    while (true)
    {
        scanf(" %[^\n]", palavra);

        if (strcmp(palavra, "FIM") == 0)
        {
            break;
        }

        bool resp = true;
        int tmnh = strlen(palavra);
        int j = tmnh - 1;
        for (int i = 0; i < (tmnh / 2); i++)
        {
            if (palavra[i] != palavra[j])
            {
                resp = false;
                break;
            }
            if (j >= 0)
            {
                j--;
            }

            else
            {
                break;
            }

        }


        if (resp == false)
        {
            printf("NAO\n");
        }


        else
        {
            printf("SIM\n");
        }

    }

    return 0;
}