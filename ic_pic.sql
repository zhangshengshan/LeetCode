set hive.strict.checks.large.query=false; set hive.mapred.mode=nonstrict;
CREATE TABLE dm_ic.tmp_ic_goods_with_teamtype_20200806_003 AS 
SELECT  
    igd.pictures                                                            AS  picture,
    igd.kdt_id                                                              AS  kdt_id 
    team_dim.team_type                                                      AS  team_type,
    get_json_object(regexp_replace(igd.pictures,'^\\[|\\]$','') , '$.url')  AS  url,
    igv.created_time                                                        AS  created_time,
    igv.update_time                                                         AS  update_time,
    igv.alias                                                               AS  alias
FROM 
    ods.ic_goods_description_all as igd  
LEFT JOIN  
    ods.ic_goods_v2 as igv 
ON 
    igd.kdt_id = igv.kdt_id 
AND 
    igd.item_id = igv.id
LEFT JOIN 
    dw.dim_team as team_dim 
ON 
    igd.kdt_id = team_dim.kdt_id 
WHERE  
    -- get_json_object(igd.pictures, '$.url') not like 'http%' 
    get_json_object(regexp_replace(igd.pictures,'^\\[|\\]$','') , '$.url') not like 'http%'
AND 
    igv.is_display = 1
ORDER BY 
    created_time desc
;

SELECT 
    team_type,
    count(*) as total_num 
FROM 
    dm_ic.ic_goods_with_teamtype_20200806_XXX
GROUP BY 
    team_type 
;
