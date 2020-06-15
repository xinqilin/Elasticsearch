# Elasticsearch

--------

# 前置作業
1. docker search elasticsearch
2. docker pull elasticsearch:版本
3. elasticsearch很吃ram(2G) 要限制run時的大小 -e<br>docker run -e ES_JAVA_OPTS="-Xms256m -Xmx256m" -d -p 9200:9200 -p 9300:9300 --name ES01 [imageID] <br>9200 ES本身port 9300 ES內每個端點port
