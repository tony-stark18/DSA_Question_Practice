#include <iostream>
using namespace std;

class Node {
public:
    int data;
    Node* left;
    Node* right;

    Node(int data) : data(data), left(nullptr), right(nullptr) {}
};

Node* insert(Node* root, int val) {
    if (root == nullptr) {
        root = new Node(val);
        return root;
    }
    if (val < root->data) {
        root->left = insert(root->left, val);
    } else {
        root->right = insert(root->right, val);
    }
    return root;
}

bool search(Node* root, int key) {
    if (root == nullptr) return false;
    if (key == root->data) return true;
    if (key < root->data) {
        return search(root->left, key);
    }
    return search(root->right, key);
}

Node* deleteNode(Node* root, int key) {
    if (!search(root, key)) return root;
    if (key < root->data) {
        root->left = deleteNode(root->left, key);
    } else if (key > root->data) {
        root->right = deleteNode(root->right, key);
    } else {
        if (root->left == nullptr && root->right == nullptr) {
            delete root;
            return nullptr;
        }
        if (root->left == nullptr) {
            Node* temp = root->right;
            delete root;
            return temp;
        }
        if (root->right == nullptr) {
            Node* temp = root->left;
            delete root;
            return temp;
        }

        Node* inOrderSuccessor = findInOrderSuccessor(root->right);
        root->data = inOrderSuccessor->data;
        root->right = deleteNode(root->right, inOrderSuccessor->data);
    }
    return root;
}

Node* findInOrderSuccessor(Node* root) {
    while (root->left != nullptr) {
        root = root->left;
    }
    return root;
}

void inorder(Node* root) {
    if (root == nullptr) return;
    inorder(root->left);
    cout << root->data << " ";
    inorder(root->right);
}

int main() {
    int values[] = {5, 1, 3, 4, 2, 7};
    Node* root = nullptr;

    for (int i : values) {
        root = insert(root, i);
    }
    
    inorder(root);
    cout << endl;

    root = deleteNode(root, 0);
    inorder(root);

    return 0;
}
