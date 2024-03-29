/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class AOrExp extends PExp
{
    private PExp _exp_;
    private TOu _ou_;
    private PExpSomaSub _expSomaSub_;

    public AOrExp()
    {
        // Constructor
    }

    public AOrExp(
        @SuppressWarnings("hiding") PExp _exp_,
        @SuppressWarnings("hiding") TOu _ou_,
        @SuppressWarnings("hiding") PExpSomaSub _expSomaSub_)
    {
        // Constructor
        setExp(_exp_);

        setOu(_ou_);

        setExpSomaSub(_expSomaSub_);

    }

    @Override
    public Object clone()
    {
        return new AOrExp(
            cloneNode(this._exp_),
            cloneNode(this._ou_),
            cloneNode(this._expSomaSub_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAOrExp(this);
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

    public TOu getOu()
    {
        return this._ou_;
    }

    public void setOu(TOu node)
    {
        if(this._ou_ != null)
        {
            this._ou_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ou_ = node;
    }

    public PExpSomaSub getExpSomaSub()
    {
        return this._expSomaSub_;
    }

    public void setExpSomaSub(PExpSomaSub node)
    {
        if(this._expSomaSub_ != null)
        {
            this._expSomaSub_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expSomaSub_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._exp_)
            + toString(this._ou_)
            + toString(this._expSomaSub_);
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

        if(this._ou_ == child)
        {
            this._ou_ = null;
            return;
        }

        if(this._expSomaSub_ == child)
        {
            this._expSomaSub_ = null;
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

        if(this._ou_ == oldChild)
        {
            setOu((TOu) newChild);
            return;
        }

        if(this._expSomaSub_ == oldChild)
        {
            setExpSomaSub((PExpSomaSub) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
