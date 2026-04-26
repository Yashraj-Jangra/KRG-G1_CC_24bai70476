class Solution {

public:

    bool findMatch(vector<vector<char>>& board, string &word, int i, int j, int wIdx){
        int wLen = word.size();
        int m = board.size();
        int n = board[0].size();

        if (wIdx == wLen) return true;

        if (i < 0 || j < 0 || i >= m || j >= n) return false;

        if (board[i][j] == word[wIdx]) {
            char temp = board[i][j];
            board[i][j] = '#'; // mark visited

            bool res = findMatch(board, word, i + 1, j, wIdx + 1) ||
                       findMatch(board, word, i - 1, j, wIdx + 1) ||
                       findMatch(board, word, i, j + 1, wIdx + 1) ||
                       findMatch(board, word, i, j - 1, wIdx + 1);

            board[i][j] = temp; // backtrack
            return res;
        }
        return false;
    }

    bool exist(vector<vector<char>>& board, string word) {
        int wLen = word.size();
        int m = board.size();
        int n = board[0].size();

        if (wLen > m * n) return false;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word[0]) {
                    if (findMatch(board, word, i, j, 0)) return true;
                }
            }
        }
        return false;
    }
};