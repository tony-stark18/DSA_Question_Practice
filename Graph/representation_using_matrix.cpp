#include <iostream>
using namespace std;

int main(){
    int n,m;
    cin>>n>>m;
    int adj[n+1][m+1];
    for(int i=0;i<m;i++){
        int u,v;
        cin>>u>>v;
        adj[u][v]=1;//for weighted graph, adj[u][v] = edge weight b/w u and v.
        adj[v][u]=1;
    }
    return 0;
}