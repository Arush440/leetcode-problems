/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* spiralOrder(int** matrix, int matrixSize, int* matrixColSize, int* returnSize) {
    int n = matrixSize;
    int m = matrixColSize[0];

    int left = 0;
    int right = m - 1;

    int top = 0;
    int bottom = n - 1;

    int total = n * m;

    int* ans = (int*)malloc(total * sizeof(int));

    int k = 0;

    while(k < total)
    {
        // left -> right
        for(int i = left; i <= right && k < total; i++)
        {
            ans[k++] = matrix[top][i];
        }
        top++;

        // top -> bottom
        for(int i = top; i <= bottom && k < total; i++)
        {
            ans[k++] = matrix[i][right];
        }
        right--;

        // right -> left
        for(int i = right; i >= left && k < total; i--)
        {
            ans[k++] = matrix[bottom][i];
        }
        bottom--;

        // bottom -> top
        for(int i = bottom; i >= top && k < total; i--)
        {
            ans[k++] = matrix[i][left];
        }
        left++;
    }

    *returnSize = total;

    return ans;
}