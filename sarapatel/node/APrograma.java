/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import java.util.*;
import analysis.*;
import sarapatel.analysis.Analysis;

@SuppressWarnings("nls")
public final class APrograma extends PPrograma
{
    private final LinkedList<PDecs> _decs_ = new LinkedList<PDecs>();
    private final LinkedList<PExp> _exp_ = new LinkedList<PExp>();

    public APrograma()
    {
        // Constructor
    }

    public APrograma(
        @SuppressWarnings("hiding") List<?> _decs_,
        @SuppressWarnings("hiding") List<?> _exp_)
    {
        // Constructor
        setDecs(_decs_);

        setExp(_exp_);

    }

    @Override
    public Object clone()
    {
        return new APrograma(
            cloneList(this._decs_),
            cloneList(this._exp_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPrograma(this);
    }

    public LinkedList<PDecs> getDecs()
    {
        return this._decs_;
    }

    public void setDecs(List<?> list)
    {
        for(PDecs e : this._decs_)
        {
            e.parent(null);
        }
        this._decs_.clear();

        for(Object obj_e : list)
        {
            PDecs e = (PDecs) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._decs_.add(e);
        }
    }

    public LinkedList<PExp> getExp()
    {
        return this._exp_;
    }

    public void setExp(List<?> list)
    {
        for(PExp e : this._exp_)
        {
            e.parent(null);
        }
        this._exp_.clear();

        for(Object obj_e : list)
        {
            PExp e = (PExp) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._exp_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._decs_)
            + toString(this._exp_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._decs_.remove(child))
        {
            return;
        }

        if(this._exp_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<PDecs> i = this._decs_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PDecs) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        for(ListIterator<PExp> i = this._exp_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PExp) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}