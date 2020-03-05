package edu.cnm.deepdive.notes;

import android.app.Application;
import com.facebook.stetho.Stetho;
import edu.cnm.deepdive.notes.service.NotesDatabase;

// NotesApplication doesnt get used until AndroidManifest is set to false in backup and named notesapplication
public class NotesApplication extends Application {

  @Override
  public void onCreate() {
    super.onCreate();
    NotesDatabase.setContext(this);
    Stetho.initializeWithDefaults(this);
    // Non-trivial database task??
  }

}
