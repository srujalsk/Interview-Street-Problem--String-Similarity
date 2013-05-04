//By Srujal S. Kachhela
//Contact: srujal.k@gmail.com

#include<iostream>
#include<stdio.h>
#include<stdlib.h>
#include<string.h>

using namespace std;

int T;

struct str_struct
{
    char str[100000];
    long str_len;
    
}arr[10];


long compare(char *tmp1,long tmp1_len,char *str,long str_len);


int main()
{
    cin>>T;
    
    char tmp_str[100000];
    long tmp_str_len;
    
    for(int i=0;i<T;i++)
    {
        cin>>arr[i].str;
        arr[i].str_len = strlen(arr[i].str);
    }
    
    for(int i=0;i<T;i++)
    {
        strcpy(tmp_str,arr[i].str);
	cout<<compare(tmp_str,strlen(tmp_str),arr[i].str,arr[i].str_len)<<"\n";
    }
    

    return 1;
}

long compare(char *tmp1,long tmp1_len,char *str,long str_len)
{
    long ans = 0,final_ans = 0;
	
	for(long n=0;n<str_len;n++)
    {
    
		for(long i=0;i<tmp1_len;i++)
		{
			if(tmp1[i] == str[i])
			{
				ans = ans + 1;
			}
			else
			{
				break;
			}
		}

		final_ans = final_ans + ans;
		tmp1++;
		tmp1_len--;
		ans = 0;
	}
    
    return final_ans;
}
