#include <iostream>
#include <queue>
#include <vector>

using namespace std;

struct Node {
    int data;
    Node* left;
    Node* right;

    Node(int val) : data(val), left(nullptr), right(nullptr) {}
};

int index = -1;

Node* buildTree(vector<int>& nodes) {
    index++;
    if (nodes[index] == -1) {
        return nullptr;
    }
    Node* newNode = new Node(nodes[index]);
    newNode->left = buildTree(nodes);
    newNode->right = buildTree(nodes);
    return newNode;
}

void preOrder(Node* root) {
    if (root == nullptr) {
        return;
    }
    cout << root->data << " ";
    preOrder(root->left);
    preOrder(root->right);
}

void inOrder(Node* root) {
    if (root == nullptr) {
        return;
    }
    inOrder(root->left);
    cout << root->data << " ";
    inOrder(root->right);
}

void postOrder(Node* root) {
    if (root == nullptr) {
        return;
    }
    postOrder(root->left);
    postOrder(root->right);
    cout << root->data << " ";
}

void LevelOrder(Node* root) {
    if (root == nullptr) return;
    queue<Node*> q;
    q.push(root);
    q.push(nullptr);
    while (!q.empty()) {
        Node* currNode = q.front();
        q.pop();
        if (currNode == nullptr) {
            cout << endl;
            if (q.empty()) {
                break;
            } else {
                q.push(nullptr);
            }
        } else {
            cout << currNode->data << " ";
            if (currNode->left != nullptr) {
                q.push(currNode->left);
            }
            if (currNode->right != nullptr) {
                q.push(currNode->right);
            }
        }
    }
}

int getHeight(Node* root) {
    if (root == nullptr) return 0;
    int lh = getHeight(root->left);
    int rh = getHeight(root->right);
    return max(lh, rh) + 1;
}

int countNodes(Node* root) {
    if (root == nullptr) return 0;
    int lc = countNodes(root->left);
    int rc = countNodes(root->right);
    return lc + rc + 1;
}

int diameter(Node* root) {
    return 0;  // Implement this function if needed
}

int diameterOptimized(Node* root, int arr[]) {
    if (root == nullptr) {
        return 0;
    }
    int ld = diameterOptimized(root->left, arr) + diameterOptimized(root->right, arr) + 1;
    arr[1] = max(arr[1], arr[0]);
    return arr[1];
}

int sumOfNodes(Node* root) {
    if (root == nullptr) return 0;
    int ls = sumOfNodes(root->left);
    int rs = sumOfNodes(root->right);
    return ls + rs + root->data;
}

int main() {
    vector<int> nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
    Node* root = buildTree(nodes);

    LevelOrder(root);

    cout << "The height of the tree is " << getHeight(root) << endl;
    cout << "Number of Nodes in the tree is " << countNodes(root) << endl;
    return 0;
}
