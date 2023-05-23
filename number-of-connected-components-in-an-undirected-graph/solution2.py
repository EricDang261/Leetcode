class Solution:
    def countComponents(self, n: int, edges: List[List[int]]) -> int:
        pars = [i for i in range(n) ] 
        rank = [1] * n

        def find(n1):
            res = n1

            while res != pars[res]:
                pars[res] = pars[pars[res]] # path compression ( for optimization)
                res = pars[res]
            return res

        def union(n1, n2):
            p1, p2 = find(n1), find(n2)

            if p1 == p2: 
                return 0
            
            if rank[p2] > rank[p1]:
                rank[p1] = rank[p2]
                rank[p2] += rank[p1]
            else:
                rank[p2] = rank[p1]
                rank[p1] += rank[p2]

            return 1

        res = n

        for e1, e2 in edges:
            res -= union(e1,e2)
        return res



        
