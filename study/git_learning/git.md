# GIT学习 #
## 一、常用命令 ##
> git init 创建版本库
> git add <file> 将file加入到暂存区
> git commit --m '提交的备注' 
> git log 查看提交历史
> git reflog 查看命令历史
> git status 查看资源库的状态
> git log --pretty=online 简略的查看操作历史
> git reset --hard HEAD 回退到当前版本
> git reset --hard HEAD^ 回退到上一个版本
> git checkout --file 清空file在工作区所做的更改
> giit reset --hard commit_id 回退到某个提交的ID
> git diff 查看与原有版本库有什么不同
> git diff HEAD -- file 查看工作区和最新版本库的区别
> git config --list 查看当前git全局配置


## 一、创建版本库 ##
> 指定一个文件夹执行 **git init**


## 二、工作区和暂存区 ##
> 工作区：执行git init的目录
> 暂存区：我们在工作区，进行增删改各种文件操作之后，我们需要git add到暂存区
> 版本库：我们工作完成之后，把暂存区的add记录，提交到版本库 git commit


## 撤销修改 ##
> 1、在未添加到暂存区时（未git add），撤销对某文件的修改：git checkout -- file;
> 2、已经添加到暂存区，但未提交到版本库：git reset HEAD 文件名
> 3、如果已经提交到版本库，就只能进行版本回退：git reset --hard commit_id

## 删除文件 ##
> 1、先进行工作区文件的删除
> 2、执行git rm 文件名(相当于 git add)
> 3、执行git commit --m '' 提交到版本库

## 远程仓库篇 ##
### 关联远程仓库 ###
> 命令：git remote add origin 远程仓库地址

### 首次推送版本库的内容到远程仓库 ###
> 命令：git push -u origin master

### 远程仓库的克隆 ###
> git clone 远程仓库地址


