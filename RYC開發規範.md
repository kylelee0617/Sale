寫作風格 : 
1. 變數命名用多峰，每字首大寫
2. >=2 用到的程式片段需獨立為function
3. 承上，若為別的class使用之function，需寫在共用區 (XXXUtils)
4. 每個小類別使用一隻class (例: 基本資料建立>基本資料建立>客戶資料建檔)，所有controller類功能依照需求寫在其中，API寫在API分類中。
5. DAO 及 Service 各功能嚴格規定寫在相應子專案中。
6. 花括弧: 前不換行，後換行。
7. if之後除非直接return，否則一律要以花括弧分出區塊。
8. 邏輯部分寫在service 。
9. web 只能參考service的物件，service只參考dao的物件，目前暫時不能逆行。
10. 設定Tab為 "2" 個空格，禁止使用tab格式。
11. 檔名尾帶上此檔案的用途，Entity、Repository、Vo 
12. dao、repository 位置放在DAO專案；Service & Vo 位置放在service專案中。
13. 


架構規範
1. 使用框架，後端 : spring boot , thyme Leaf , hibernate JPA ；前端 : html , jquery
2. html檔案編號在實現功能時更名為舊系統畫面上方的功能編號，url不變。
3. api呼叫範例 web.api.test & service.api.test