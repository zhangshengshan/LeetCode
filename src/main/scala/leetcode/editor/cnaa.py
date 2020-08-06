import re
s = "desc=(ProxyGoodsAnalysisServiceImpl.getGoodsTop)异常"
print(s)


re.findAll(r"desc=(.+?)", s)

