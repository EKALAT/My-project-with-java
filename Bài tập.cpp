# include <iostream>
using namespace std;
int n,s;
int main()
{
    cout<<"Nhap gia tri n:";
    cin>>n;
    for(int i=0;i<=n;i++){
        s+=i;
    }cout<<"Tong cac gia tri la : "<<s;
    return 0;
}
