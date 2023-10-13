class Solution {
public:
    vector<vector<int>> levelOrder(TreeNode* root) {
        
        vector<vector<int>>ans;
        if(root==NULL){
            return ans;
        }
        queue<TreeNode*>st;
        st.push(root);
        st.push(NULL);
        vector<int>v;
        while(!st.empty()){
            TreeNode* temp=st.front();
            st.pop();
            if(temp==NULL){
                if(!st.empty()){
                    st.push(NULL);
                }
                  
                  ans.push_back(v);
                  v.erase(v.begin(),v.end());

                
                
            }
            else{
            
              v.push_back(temp->val);
              
              if(temp->left!=NULL)
              {  st.push(temp->left);
              } 
              if(temp->right!=NULL){
                 st.push(temp->right);
              }
            }
            
        }
        return ans;
    }
};
