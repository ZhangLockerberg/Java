public class ContactsManager {
    Contact [] myFriends;
    int friendsCount;

    // Constructor to initialize:
    ContactsManager(){
        this.friendsCount = 0;
        this.myFriends = new Contact[500];
    }

    // 1st Method:
    void addContact(Contact contact){
        myFriends[friendsCount] = contact;
        friendsCount++;
    }

    // 2nd Method:
    Contact searchContact(String SearchName){
        for(int i=0; i<friendsCount; i++){
            if(myFriends[i].name.equals(SearchName)){
                return myFriends[i];
            }
        }
        return null;
    }
}
