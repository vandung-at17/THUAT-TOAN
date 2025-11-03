package vd.code.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyBST {
    public TreeNode root;
    public TreeNode insert(TreeNode root, int value){
        // TH1: root == null thì trả ra luôn cái new Node
        if (root==null){
            // Trả ra luôn cái new Node
            root = new TreeNode(value);
            return root;
        }else{
            // TH2: root != null
            // Tạo 1 node tạm để duyệt cây ví dụ ở đây ta tạo Node temp
            TreeNode temp = root;
            while (true){
                // nếu nút có giá trị nhỏ hơn giá trị gán
                if(temp.value < value){
                    if(temp.right == null){
                        temp.right= new TreeNode(value);
                        break;
                    }else{
                        temp = temp.right;
                    }
                }else {
                    if (temp.left == null){
                        temp.left= new TreeNode(value);
                        break;
                    }else{
                        temp = temp.left;
                    }
                }
            }
            return root;
        }
    }

    public TreeNode insertIntoBST (TreeNode rootNode, int value){
        // TH1: root == null thì trả ra luôn cái new Node mới
        if (rootNode == null){
            // Trả ra luôn node mới
            rootNode = new TreeNode(value);
            return rootNode;
        }else{
            // TH2: root != null
            if(value < rootNode.value){
                if (rootNode.left == null){
                    rootNode.left = new TreeNode(value);
                }else{
                    insertIntoBST(rootNode.left,value);
                }
            }else{
                if (rootNode.right == null){
                    rootNode.right = new TreeNode(value);
                }else{
                    insertIntoBST(rootNode.right,value);
                }

            }
        }
        return rootNode;
    }

    public TreeNode deleteNode (TreeNode rootNode, int value){
        if(rootNode == null){
            return null;
        }
        //Bước 1 : Đi tìm node xóa
        if (value < rootNode.value){
            rootNode.left = deleteNode(rootNode.left, value);
        }else if (value > rootNode.value){
            rootNode.right = deleteNode(rootNode.right, value);
        }else{
            // tức là node cần xóa nó là node root luôn
            // rootNode,value = key => xóa root | Xác định được node cần xóa
            // Bước 2: Xóa node root
            // TH1: root là node lá: (Điều kiện mà node lá là không có node con trái phải)
            if (rootNode.left == null && rootNode.right == null){
                return null;
            }
            // TH2: Chỉ có 1 con bên trái
            if (rootNode.left != null && rootNode.right == null){
                return rootNode.left;
            }
            // TH3: Chỉ có 1 con bên phải
            if (rootNode.right != null && rootNode.left == null){
                return rootNode.right;
            }
            // TH4: Tồn tại cả 2 con bên phải và bên trái
            // Tìm node trái cùng của cây con bên phải
            TreeNode leftModeNode = findLeftModeNode(rootNode.right);
            rootNode.value = leftModeNode.value;
            rootNode.right = deleteNode(rootNode.right, leftModeNode.value);
            return rootNode;
        }
        return rootNode;
    }

    // Hàm tìm node trái cùng của 1 cây
    public TreeNode findLeftModeNode (TreeNode root){
        if (root == null){
            return null;
        }else{
            TreeNode leftMostNode = root;
            while(leftMostNode.left != null){
                leftMostNode = leftMostNode.left;
            }
            return leftMostNode;
        }
    }

    public TreeNode searchBST(TreeNode rootNode, int value){
        // Nếu cây root mà là rỗng thì return null
        if (rootNode == null){
            return null;
        }
        // Nếu là nhỏ hơn giá trị value thì dịch root sang trái duyệt node bên trái
        if (value < rootNode.value){
            return searchBST(rootNode.left, value);
        }
        // Nếu là lớn hơn giá trị value thì dịch root sang phải duyệt node bên phải
        else if (value > rootNode.value) {
            return searchBST(rootNode.right, value);
        }
        // Trường hợp nếu giá trị value bằng giá trị root thì đúng node cần tìm
        else{
            return rootNode;
        }
    }
}
