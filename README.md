# git-training something more

## Building the application from Source Code

#### In order to build the application from the source code, perform the following tasks

1. Checkout the source code into a folder.

   ```
   git clone https://github.com/ennovatenow/git-training.git 
   ```

2. Build the application using the following Maven command
   ```
   cd git-training
   mvn clean install -f git-training/
   ```

## Making Changes
In order to make code changes, check out the code as mentioned in the section 'Building the application from source code'.
Use an IDE like Eclipse to make the necessary changes and commit the changes. Test the application and if the changes are satisfactory, raise a Pull Request in Github mentioning the changes made. If the review of the changes is satisfactory then the same will be merged into the next releases, else review the comments and make appropriate changes.

## Commiting changes to the local repository

1.After working on the  files and once it is tested and made sure if it is working fine, commit the  changes to the remote repository.

2.Once the changes have been made run the following command to stay updated on the latest version of the remote repository:
   ```
 git pull 
  ```
3.Run the follwing command to add changes in the working directory to the staging area.   :
 ```
 git add filename
 ```
4.Then commit the file into the local repository:
 ```
 git commit -a -m "Log Message"
 ```
5.Once the changes have been commited to the local repository, push the changes to the central/remote repository
  ```
 git push
  ```

## Making Release
Follow the steps given below to give a release for the eMandate Switch application

1. Check out the code as mentioned in the section `Building the application from source code` and navigate to the folder into which the code is checked out.
```
git clone  https://github.com/ennovatenow/git-training.git git-training-release
cd git-training-release
```

2. Delete the existing **release** branch and create a new one.

```
git branch -d release
git push origin -d release
git checkout -b release
git push origin release
```

3. Build the application using the following Maven command

```
cd training-parent
mvn clean install 
```

4. Start the release using the following Maven command

```
mvn external.atlassian.jgitflow:jgitflow-maven-plugin:release-start -DautoVersionSubmodules=true -Dmaven.javadoc.skip=true
```
Answer the questions to choose the next versions and release version names

6. Finish the release using the following Maven command

```
mvn external.atlassian.jgitflow:jgitflow-maven-plugin:release-finish -DautoVersionSubmodules=true -Dmaven.javadoc.skip=true
```
 
7. Push the changed versions/tags to the central repository

```
cd ..
git push origin release
git push origin main
git push --tags
```
   
8.deploy the release snapshots checkout into nexus

```
cd git-training-release
git checkout release

cd training-parent
mvn deploy
````

