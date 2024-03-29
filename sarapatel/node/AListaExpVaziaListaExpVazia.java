/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import java.util.*;
import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class AListaExpVaziaListaExpVazia extends PListaExpVazia
{
    private PExp _exp_;
    private final LinkedList<PSeparadorExp> _separadorExp_ = new LinkedList<PSeparadorExp>();

    public AListaExpVaziaListaExpVazia()
    {
        // Constructor
    }

    public AListaExpVaziaListaExpVazia(
        @SuppressWarnings("hiding") PExp _exp_,
        @SuppressWarnings("hiding") List<?> _separadorExp_)
    {
        // Constructor
        setExp(_exp_);

        setSeparadorExp(_separadorExp_);

    }

    @Override
    public Object clone()
    {
        return new AListaExpVaziaListaExpVazia(
            cloneNode(this._exp_),
            cloneList(this._separadorExp_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAListaExpVaziaListaExpVazia(this);
    }

    public PExp getExp()
    {
        return this._exp_;
    }

    public void setExp(PExp node)
    {
        if(this._exp_ != null)
        {
            this._exp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp_ = node;
    }

    public LinkedList<PSeparadorExp> getSeparadorExp()
    {
        return this._separadorExp_;
    }

    public void setSeparadorExp(List<?> list)
    {
        for(PSeparadorExp e : this._separadorExp_)
        {
            e.parent(null);
        }
        this._separadorExp_.clear();

        for(Object obj_e : list)
        {
            PSeparadorExp e = (PSeparadorExp) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._separadorExp_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._exp_)
            + toString(this._separadorExp_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._exp_ == child)
        {
            this._exp_ = null;
            return;
        }

        if(this._separadorExp_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._exp_ == oldChild)
        {
            setExp((PExp) newChild);
            return;
        }

        for(ListIterator<PSeparadorExp> i = this._separadorExp_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PSeparadorExp) newChild);
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
