##Description
Common command for using shell.

##System

###1. Background Session:

`ps -aux | grep "fileName"`

###2. Email

Use std input redirect: `mail -s "Topic" receiver < file`

Use pipe: `command | mail -s "Topic" receiver`

Use appendix: `mail -s "Topic" receiver -a appendix < file`

##File and Folder



##Execute

###1. Background execute and output redirect

`nohup command &`

`command >(overwrite)/>>(add) redirectFile 2>&1`

`nohup command > redirectFile 2>&1 &`

###2. Crontab

`mm hh dd MM d/w command`
