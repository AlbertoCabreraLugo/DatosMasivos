//Clone our PC
git clone "https://github.com/AlbertoCabreraLugo/DatosMasivos"
//Create a branch called development and make this branch the main one, this means that it will not be master 
git checkout -b development

//Making a change to the development branch in the README.md file could be "This is the development branch"
git checkout  Unidad1

//Make a commit in the development branch
git commit -m "Commit message"

//Push the development branch
git push

//Create a branch called features
git checkout -b features

//Make the commit on this branch
git commit -m "Changes in features"

//Do the push and verify that the change is in the repository
git push
git status
