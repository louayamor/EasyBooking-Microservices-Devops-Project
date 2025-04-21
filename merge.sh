for branch in $(git branch -r | grep -v '\->' | grep -vE 'origin/(main|dev)'); do
  git merge $branch --allow-unrelated-histories
done
