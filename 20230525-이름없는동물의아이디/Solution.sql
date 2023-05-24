SELECT ANIMAL_ID FROM ANIMAL_INS WHERE NAME IS NULL

-- Null인 데이터 조회하기 --
SELECT * FROM TargetTable
WHERE TargetField IS NULL

-- Null이 아닌 데이터 조회하기 -- 
SELECT * FROM TargetTable
WHERE TargetField IS NOT NULL
