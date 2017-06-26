/*
Als erster Vorschlag für eine Transaktion..
*/


public class Transaction
{

  private List<TransactionItem> savedStates;

  public void process(TransactionItem... items)
  {
    saveCurrentStates(items)

    try{
      for(items : TransactionItem item)
      {
        item.doChanges()
      }
      catch(throwable e)
      {
        reverseChanges(items);
        throw e;
      }
    }
  }

  private void saveCurrentStates(items)
  {
    for(items: transationItem item)
    {
      savedStates.add(item.copy());
    }
  }

  private void reverseChanges(items)
  {
    for(int i=0; i<savedStates.size(); i++)
    {
      if(!items.get(i).equals(savedStates.get(i)))
      {
        items.set(i, savedStates.get(i));
      }
    }
  }
}
