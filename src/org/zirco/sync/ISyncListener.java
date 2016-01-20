package org.zirco.sync;

//Download by http://www.codefans.net
public interface ISyncListener {

    void onSyncProgress(int step, int done, int total);

    void onSyncEnd(Throwable result);

    void onSyncCancelled();

}
