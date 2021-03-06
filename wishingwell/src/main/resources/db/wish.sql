CREATE TABLE `wish` (
	`id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
	`content` VARCHAR(2000) NULL DEFAULT NULL COMMENT '愿望内容' COLLATE 'utf8_bin',
	`is_fulfilled` INT(11) NOT NULL DEFAULT '0' COMMENT '是否完成（0：否 1：是）',
	`account_id` BIGINT(20) NOT NULL COMMENT '关联账号ID',
	`account` VARCHAR(50) NOT NULL COMMENT '关联账号' COLLATE 'utf8_bin',
	`create_time` DATETIME NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
	`update_time` DATETIME NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
	`fulfilled_time` DATETIME NULL DEFAULT NULL COMMENT '完成时间',
	`fulfilled_account_id` BIGINT(20) NULL DEFAULT NULL COMMENT '完成者账号ID',
	`fulfilled_account` VARCHAR(50) NULL DEFAULT NULL COMMENT '完成者账号' COLLATE 'utf8_bin',
	`delete_flg` INT(11) NOT NULL DEFAULT '0' COMMENT '是否删除（0：否 1：是）',
	PRIMARY KEY (`id`)
)
COMMENT='愿望表'
COLLATE='utf8_bin'
ENGINE=InnoDB
AUTO_INCREMENT=8
;